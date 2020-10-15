package com.example.recyclerviewdemo2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {



    private val fruitList = ArrayList<Fruit>()

    fun initFruits() {
        repeat(5)
        {
            fruitList.add(Fruit(R.drawable.changlong,"长隆欢乐世界","最开心的嘉年华","已售13144 | 30.1km","￥199","起"))
            fruitList.add(Fruit(R.drawable.haiyang, "长隆水上乐园", "海底世界", "已售13564 | 30.1km", "￥250", "起"))
            fruitList.add(Fruit(R.drawable.hans, "麦香鸡", "好吃", "已售92 | 1.9km", "￥23", "起"))
            fruitList.add(Fruit(R.drawable.maidangl, "叫了个鸡", "购买人数最多", "已售8402 | 0.7km", "￥40", "起"))
            fruitList.add(Fruit(R.drawable.laobanz, "大闸蟹", "特别", "已售5400 | 0.6km", "￥70", "起"))
            fruitList.add(Fruit(R.drawable.rongc, "长隆动物世界", "一起来看长颈鹿", "已售22619 | 30.1km", "￥159", "起"))
            fruitList.add(Fruit(R.drawable.taoyuans, "一点点", "每天一点点", "已售32619 | 0.2km", "￥15", "起"))
        }
    }

/*
*生成随机数量的字符串
 */
//    private fun getRandomLengthString(string: String):String{
//    val n=(1..20).random()
//    val builder=StringBuffer()
//    repeat(n){
//        builder.append(string)
//    }
//    return builder.toString()
//}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //数据初始化
        initFruits()
        //创建线性布局管理器
//        val layoutManager=LinearLayoutManager(this)
        //创建瀑布布局管理器
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        //设置线性方向为横向
//        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        //设置布局管理器
        RecyclerViewTest.layoutManager = layoutManager
        //实例化数据适配器，装载数据
        val adapter = FruitAdapter(fruitList)
//       RecyclerViewTest.layoutManager=LinearLayoutManager(this)
        //将数据适配器的设置到控件上
        RecyclerViewTest.adapter = adapter

    }
}












