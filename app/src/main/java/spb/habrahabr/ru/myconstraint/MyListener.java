package spb.habrahabr.ru.myconstraint;


import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by admin on 15.04.2018.
 */

public interface MyListener {
    void onClick(@NonNull View itemView, @NonNull int position);
}
