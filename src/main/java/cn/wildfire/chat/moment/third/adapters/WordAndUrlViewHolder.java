package cn.wildfire.chat.moment.third.adapters;

import android.view.View;
import android.widget.LinearLayout;

import cn.wildfirechat.chat.R;

class WordAndUrlViewHolder extends BaseFriendCircleViewHolder {

    LinearLayout layoutUrl;

    public WordAndUrlViewHolder(View itemView) {
        super(itemView);
        layoutUrl = itemView.findViewById(R.id.layout_url);
    }
}
