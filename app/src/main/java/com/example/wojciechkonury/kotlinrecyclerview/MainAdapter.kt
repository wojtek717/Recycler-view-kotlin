package com.example.wojciechkonury.kotlinrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<CustomVievHolder>(){


    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomVievHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, p0, false) //Tutaj wstawiamy plik layout

        return CustomVievHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomVievHolder, p1: Int) {
//        val videoTitle = videoTitles.get(p1)
        val video = homeFeed.videos.get(p1)

        p0.view.textView_video_title.text = video.name
        p0.view.textView_video_authorname.text = video.channel.name
    }
}

class CustomVievHolder(val view: View) : RecyclerView.ViewHolder(view)
{

}