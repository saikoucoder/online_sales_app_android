package com.example.e_commerce_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.e_commerce_app.R;
import com.example.e_commerce_app.adapters.CategoryAdapter;
import com.example.e_commerce_app.adapters.ProductAdapter;
import com.example.e_commerce_app.databinding.ActivityMainBinding;
import com.example.e_commerce_app.model.Category;
import com.example.e_commerce_app.model.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;


    ProductAdapter productAdapter;
    ArrayList<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initCategories();
        initProducts();
        initSlider();

    }

    private void initSlider() {
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-vector/special-offer-creative-sale-banner-design_1017-16284.jpg?1","Some caption here"));
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/1668213355358.jpg","Some caption here"));
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/Essential%20Oil.jpg","Some caption here"));
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/1668214296733.jpg","Some caption here"));
    }

    void initCategories(){
        categories=new ArrayList<>();
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#54cfdd","Some description",1));
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#ce71c6","Some description",1));
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#54bcc9","Some description",1));
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#c979d1","Some description",1));
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#cc5ce0","Some description",1));
        categories.add(new Category("Food & Fun","https://tutorials.mianasad.com/ecommerce/uploads/category/1668709090808.png","#5dcce2","Some description",1));
        categoryAdapter = new CategoryAdapter(this, categories);
        GridLayoutManager layoutManager =new GridLayoutManager(this, 4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }
    void initProducts(){
         products = new ArrayList<>();
         products.add(new Product("Wireless Gamepad","https://tutorials.mianasad.com/ecommerce/uploads/product/1668717291595.jpg","",12,12,1,1));
         products.add(new Product("Wireless Gamepad","https://tutorials.mianasad.com/ecommerce/uploads/product/1668717291595.jpg","",12,12,1,1));
        products.add(new Product("Wireless Gamepad","https://tutorials.mianasad.com/ecommerce/uploads/product/1668717291595.jpg","",12,12,1,1));
         products.add(new Product("Wireless Gamepad","https://tutorials.mianasad.com/ecommerce/uploads/product/1668717291595.jpg","",12,12,1,1));
         productAdapter = new ProductAdapter(this, products);
         GridLayoutManager layoutManager = new GridLayoutManager(this,2);
         binding.productList.setLayoutManager(layoutManager);
         binding.productList.setAdapter(productAdapter);
    }
}