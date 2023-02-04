package com.example.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var imgArray:MutableList<Int> = mutableListOf()
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgArray.add(R.drawable.img0)
        imgArray.add(R.drawable.img1)
        imgArray.add(R.drawable.img2)
        imgArray.add(R.drawable.img3)
        imgArray.add(R.drawable.img4)
        imgArray.add(R.drawable.img5)
        imgArray.add(R.drawable.img6)
        imgArray.add(R.drawable.img7)

        prev.setOnClickListener {
            if (index > 0){
                index--
            }
            else{
                index = imgArray.size-1
            }
            pic.setImageResource(imgArray[index])
        }

        next.setOnClickListener {
            if (index < imgArray.size-1){
                index++
            }
            else{
                index = 0
            }
            pic.setImageResource(imgArray[index])
        }
    }

    fun imgClick(view: View) {
        var id = view.id
        index = view.tag.toString().toInt()
        if (id == R.id.img0){
            pic.setImageResource(R.drawable.img0)
        }else if (id == R.id.img1){
            pic.setImageResource(R.drawable.img1)
        }else if (id == R.id.img2){
            pic.setImageResource(R.drawable.img2)
        }else if (id == R.id.img3){
            pic.setImageResource(R.drawable.img3)
        }else if (id == R.id.img4){
            pic.setImageResource(R.drawable.img4)
        }else if (id == R.id.img5){
            pic.setImageResource(R.drawable.img6)
        }else if (id == R.id.img6){
            pic.setImageResource(R.drawable.img7)
        }else if (id == R.id.img7){
            pic.setImageResource(R.drawable.img8)
        }
        img0.visibility = View.INVISIBLE
        img1.visibility = View.INVISIBLE
        img3.visibility = View.INVISIBLE
        img2.visibility = View.INVISIBLE
        img4.visibility = View.INVISIBLE
        img5.visibility = View.INVISIBLE
        img6.visibility = View.INVISIBLE
        img7.visibility = View.INVISIBLE
        pic.visibility = View.VISIBLE
        prev.visibility = View.VISIBLE
        exit.visibility = View.VISIBLE
        next.visibility = View.VISIBLE
    }

    fun exit(view: View) {
        img0.visibility = View.VISIBLE
        img1.visibility = View.VISIBLE
        img3.visibility = View.VISIBLE
        img2.visibility = View.VISIBLE
        img4.visibility = View.VISIBLE
        img5.visibility = View.VISIBLE
        img6.visibility = View.VISIBLE
        img7.visibility = View.VISIBLE
        pic.visibility = View.INVISIBLE
        prev.visibility = View.INVISIBLE
        next.visibility = View.INVISIBLE
        view.visibility = View.INVISIBLE
    }
}


