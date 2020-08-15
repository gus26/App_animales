package controlador;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numbTabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numbTabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Perros();

            case 1:
                return new Gatos();
            case 2:
                return new Caballos();
            case 3:
                return new Peces();
            default:
                return  null;



        }



    }

    @Override
    public int getCount() {
        return numbTabs;
    }
}
