package com.pad.androidfinaljob;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * "_id":"5e9830b0ce330a0248e89d86",
 * "feedurl":"http://jzvd.nathen.cn/video/1137e480-170bac9c523-0007-1823-c86-de200.mp4",
 * "nickname":"王火火",
 * "description":"这是第一条Feed数据",
 * "likecount":10000,
 * "avatar":"http://jzvd.nathen.cn/snapshot/f402a0e012b14d41ad07939746844c5e00005.jpg",
 */

class VideoInfo {

    @SerializedName("_id")
    public String _id;
    @SerializedName("feedurl")
    public String feedUrl;
    @SerializedName("nickname")
    public String nickname;
    @SerializedName("description")
    public String description;
    @SerializedName("likecount")
    public int likeCount;
    @SerializedName("avatar")
    public String avatarUrl;

    @Override
    public String toString() {
        return "VideoInfo{" +
                "id=" + _id +
                ", feedUrl='" + feedUrl +
                ", nickname=" + nickname +
                ", description=" + description +
                ", likeCount=" + likeCount +
                ", avatar=" + avatarUrl +
                '}';
    }
}
