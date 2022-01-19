package com.salari.tictoctoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resetBtt=findViewById<Button>(R.id.resetBtt)
        val btt1=findViewById<FrameLayout>(R.id.Btt1)
        val btt2=findViewById<FrameLayout>(R.id.Btt2)
        val btt3=findViewById<FrameLayout>(R.id.Btt3)
        val btt4=findViewById<FrameLayout>(R.id.Btt4)
        val btt5=findViewById<FrameLayout>(R.id.Btt5)
        val btt6=findViewById<FrameLayout>(R.id.Btt6)
        val btt7=findViewById<FrameLayout>(R.id.Btt7)
        val btt8=findViewById<FrameLayout>(R.id.Btt8)
        val btt9=findViewById<FrameLayout>(R.id.Btt9)
        val img1=findViewById<ImageView>(R.id.Img1)
        val img2=findViewById<ImageView>(R.id.Img2)
        val img3=findViewById<ImageView>(R.id.Img3)
        val img4=findViewById<ImageView>(R.id.Img4)
        val img5=findViewById<ImageView>(R.id.Img5)
        val img6=findViewById<ImageView>(R.id.Img6)
        val img7=findViewById<ImageView>(R.id.Img7)
        val img8=findViewById<ImageView>(R.id.Img8)
        val img9=findViewById<ImageView>(R.id.Img9)
        val wintext=findViewById<TextView>(R.id.wintext)
        val l1= listOf(1,2,3)
        val l2= listOf(4,5,6)
        val l3= listOf(7,8,9)
        val l4= listOf(1,4,7)
        val l5= listOf(2,5,8)
        val l6= listOf(3,6,9)
        val l7= listOf(1,5,9)
        val l8= listOf(3,5,7)




        var listPlayerOne= mutableListOf<Int>()
        var listPlayerTwo= mutableListOf<Int>()
        var playerFlag=true
        btt1.setOnClickListener {
            if (playerFlag) {
                listPlayerOne.add(1)
                img1.setImageResource(R.drawable.oshape)
                img1.isVisible = true
                playerFlag = false
            } else {
                listPlayerTwo.add(1)
                img1.setImageResource(R.drawable.xshape)
                img1.isVisible = true
                playerFlag = true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")

                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")

                }
            }
        }
        btt2.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(2)
                img2.setImageResource(R.drawable.oshape)
                img2.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(2)
                img2.setImageResource(R.drawable.xshape)
                img2.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt3.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(3)
                img3.setImageResource(R.drawable.oshape)
                img3.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(3)
                img3.setImageResource(R.drawable.xshape)
                img3.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt4.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(4)
                img4.setImageResource(R.drawable.oshape)
                img4.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(4)
                img4.setImageResource(R.drawable.xshape)
                img4.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt5.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(5)
                img5.setImageResource(R.drawable.oshape)
                img5.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(5)
                img5.setImageResource(R.drawable.xshape)
                img5.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt6.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(6)
                img6.setImageResource(R.drawable.oshape)
                img6.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(6)
                img6.setImageResource(R.drawable.xshape)
                img6.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true

                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt7.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(7)
                img7.setImageResource(R.drawable.oshape)
                img7.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(7)
                img7.setImageResource(R.drawable.xshape)
                img7.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt8.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(8)
                img8.setImageResource(R.drawable.oshape)
                img8.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(8)
                img8.setImageResource(R.drawable.xshape)
                img8.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true


                }
            }
        }
        btt9.setOnClickListener {
            if (playerFlag){
                listPlayerOne.add(9)
                img9.setImageResource(R.drawable.oshape)
                img9.isVisible=true
                playerFlag=false
            }
            else{
                listPlayerTwo.add(9)
                img9.setImageResource(R.drawable.xshape)
                img9.isVisible=true
                playerFlag=true
            }
            if (3 <= listPlayerOne.size) {
                if (listPlayerOne.containsAll(l1) || listPlayerOne.containsAll(l2) || listPlayerOne.containsAll(
                        l3
                    ) || listPlayerOne.containsAll(l4) || listPlayerOne.containsAll(l5) || listPlayerOne.containsAll(
                        l6
                    ) || listPlayerOne.containsAll(l7) || listPlayerOne.containsAll(l8)
                ) {
                    wintext.setText("player 1 won")
                    wintext.isVisible=true


                }
            }
            if (3 <= listPlayerTwo.size) {
                if (listPlayerTwo.containsAll(l1) || listPlayerTwo.containsAll(l2) || listPlayerTwo.containsAll(
                        l3
                    ) || listPlayerTwo.containsAll(l4) || listPlayerTwo.containsAll(l5) || listPlayerTwo.containsAll(
                        l6
                    ) || listPlayerTwo.containsAll(l7) || listPlayerTwo.containsAll(l8)
                ) {
                    wintext.setText("player 2 won")
                    wintext.isVisible=true

                }
            }
        }
        resetBtt.setOnClickListener {
            listPlayerOne.clear()
            listPlayerTwo.clear()
            playerFlag=true
            img1.isGone=true
            img2.isGone=true
            img3.isGone=true
            img4.isGone=true
            img5.isGone=true
            img6.isGone=true
            img7.isGone=true
            img8.isGone=true
            img9.isGone=true
            wintext.isGone=true

        }


    }
}