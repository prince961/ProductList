package com.example.mohit.productlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohit on 10/5/2016.
 */

public class ListAdapterImagLess extends ArrayAdapter<ModelProducts> {

    private int layout;
    private List<ModelProducts> productList;
    Controller controller;

    public ListAdapterImagLess(Context context, int resource, List<ModelProducts> productList,Controller controller){
        super(context,resource,productList);
        this.productList = productList;
        this.layout = resource;
        this.controller = controller;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ListAdapterImagLess.ProductListViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(getContext());

        if(convertView == null){
            convertView = inflater.inflate(layout,parent,false);
            viewHolder = new ListAdapterImagLess.ProductListViewHolder();
            //viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.item_image);

            viewHolder.title = (TextView) convertView.findViewById(R.id.item_title);
            viewHolder.price = (TextView) convertView.findViewById(R.id.item_price1);
            //viewHolder.title.setText(controller.getNoodleP(position).getProductName());
            //viewHolder.title.setText(getItem(8).getProductName());
            //viewHolder.thumbnail.setImageResource(controller.getProducts(position).getImage());
            //Bitmap myBitmap = BitmapFactory.decodeFile(controller.getProducts(position).getImage());
            //viewHolder.thumbnail.setImageResource(getItem(position).getImage());
            viewHolder.addBtn = (ImageView)convertView.findViewById(R.id.addBtn);
            viewHolder.reduceBtn = (ImageView) convertView.findViewById(R.id.reduceBtn);
            viewHolder.quantity = (TextView) convertView.findViewById(R.id.tvQuantity);

            final ListAdapterImagLess.ProductListViewHolder finalViewHolder = viewHolder;
            viewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //String StringQuantity = viewHolder.quantity.getText().toString();
                    //int quantity = Integer.parseInt(StringQuantity);
                    int quantity = controller.getNoodleP(position).getProductQuantity();
                    int newQuant = quantity+1;
                    controller.getNoodleP(position).setProductQuantity(newQuant);
                    finalViewHolder.quantity.setText(Integer.toString(controller.getNoodleP(position).getProductQuantity()));
                    //viewHolder.quantity.setText(Integer.toString(controller.getProducts(position).getProductQuantity()));
                    if(quantity == 0){ controller.getCart().setProducts(productList.get(position));
                    notifyDataSetChanged();}

                }
            });
            final ProductListViewHolder finalViewHolder1 = viewHolder;
            viewHolder.reduceBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String StringQuantity = finalViewHolder1.quantity.getText().toString();
                    int quantity = Integer.parseInt(StringQuantity);
                    notifyDataSetChanged();
                    if (quantity>0){
                    int newQuant = quantity-1;
                        if(newQuant == 0){controller.getCart().removeProduct(productList.get(position));
                        finalViewHolder.quantity.setText(Integer.toString(controller.getNoodleP(position).getProductQuantity()));
                        }
                    productList.get(position).setProductQuantity(newQuant);
                    finalViewHolder1.quantity.setText(Integer.toString(controller.getNoodleP(position).getProductQuantity()));
                        notifyDataSetChanged();
                    }



                }
            });

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ListAdapterImagLess.ProductListViewHolder) convertView.getTag();
            //mainViewHolder.price.setText(Integer.toString(28));
            //mainViewHolder.title.setText(getItem(position).getProductName());
            //mainViewHolder.price.setText(getItem(position).getProductPrice());
        }

        //viewHolder.quantity.setText(Integer.toString(controller.getProducts(position).getProductQuantity()));
        viewHolder.title.setText(getItem(position).getProductName());
        viewHolder.quantity.setText(Integer.toString(getItem(position).getProductQuantity()));
        viewHolder.price.setText(Integer.toString(getItem(position).getProductPrice()));

        return convertView;
    }

    public class ProductListViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView price;
        ImageView addBtn;
        ImageView reduceBtn;
        TextView quantity;
    }
}
