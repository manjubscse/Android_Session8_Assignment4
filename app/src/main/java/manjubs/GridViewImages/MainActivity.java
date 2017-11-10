package manjubs.GridViewImages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ImageList> imageList;
    // Activity on Create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Creating a grid view control object
        setContentView(R.layout.activity_main);GridView gridView =(GridView)findViewById(R.id.imagelist);
        initVersionImage();
        //initializing the adaptor
        VersionAdapter versionAdapter=new VersionAdapter(this,imageList);
        gridView.setAdapter((ListAdapter) versionAdapter);

    }
    // Method to load images
    public void initVersionImage(){
        //object of Arralist
        imageList=new ArrayList<ImageList>();
        // Adding Images one by one
        imageList.add(new ImageList(R.drawable.gingerbread));
        imageList.add(new ImageList(R.drawable.honeycomb));
        imageList.add(new ImageList(R.drawable.icecream));
        imageList.add(new ImageList(R.drawable.jellybean));
        imageList.add(new ImageList(R.drawable.kitkat));
        imageList.add(new ImageList(R.drawable.lollypop));
    }
}
