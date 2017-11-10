package manjubs.GridViewImages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Manju B S on 07 Nov 2017.
 */

public class VersionAdapter extends BaseAdapter{
    Context context;
    List<ImageList> imageList;

    public VersionAdapter(Context context,List<ImageList>images){
        this.context=context;
        this.imageList=images;
    }


    // SET count of images
    @Override
    public int getCount() {
        return imageList.size();
    }

    // get the images list with id
    @Override
    public Object getItem(int i) {
        return imageList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //Get the view method
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.dataimage,viewGroup,false);
            ImageView name=(ImageView)view.findViewById(R.id.imageView);
            ImageList images = imageList.get(i);
            name.setImageResource(images.id);
        }
        return view;
    }
}
