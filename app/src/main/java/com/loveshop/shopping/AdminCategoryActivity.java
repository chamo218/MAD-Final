package com.loveshop.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView clothing, flowers, giftcard;
    private ImageView gift, teddy, accesories;
    private ImageView food, mobile, book;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        clothing = (ImageView) findViewById(R.id.clothing);
        flowers = (ImageView) findViewById(R.id.flowers);
        giftcard = (ImageView) findViewById(R.id.giftcard);

        gift = (ImageView) findViewById(R.id.gift);
        teddy = (ImageView) findViewById(R.id.teddy);
        accesories = (ImageView) findViewById(R.id.accesories);

        food = (ImageView) findViewById(R.id.food);
        mobile = (ImageView) findViewById(R.id.mobile);
        book = (ImageView) findViewById(R.id.book);


        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Clothing");
                startActivity(intent);
            }
        });
        flowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Flowers");
                startActivity(intent);
            }
        });


        giftcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Gift Cards");
                startActivity(intent);
            }
        });


        gift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Gift Boxes");
                startActivity(intent);
            }
        });


        teddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Stuffed Toys");
                startActivity(intent);
            }
        });


        accesories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Accessories");
                startActivity(intent);
            }
        });



        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Food & Beverages");
                startActivity(intent);
            }
        });


        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Mobile Accessories");
                startActivity(intent);
            }
        });



        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.loveshop.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Books");
                startActivity(intent);
            }
        });


    }
}
