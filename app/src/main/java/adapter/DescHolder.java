//package adapter;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.TextView;
//
//import entity.HotelEntity;
//import view.lyd.com.sectionrecyclerviewdemo.R;
//
///**
// * Created by lyd10892 on 2016/8/23.
// */
//
//public class DescHolder extends RecyclerView.ViewHolder {
//    public TextView descView;
//    public HotelEntity.TagsEntity.TagInfo mTagInfo;
//
//    public DescHolder(View itemView) {
//        super(itemView);
//        initView(itemView);
//    }
//
//    private void initView(final View itemView) {
//        descView = (TextView) itemView.findViewById(R.id.tv_desc);
//        descView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                itemView.setSelected(mTagInfo.isSelected = !mTagInfo.isSelected);
//                if (mTagInfo.isSelected) {
//                    selectedSet.add(square.number);
//                } else {
//                    selectedSet.remove(square.number);
//                }
//            }
//        });
//    }
//}
