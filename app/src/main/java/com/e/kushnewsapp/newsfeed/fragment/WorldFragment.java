package com.e.kushnewsapp.newsfeed.fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.e.kushnewsapp.newsfeed.News;
import com.e.kushnewsapp.newsfeed.NewsLoader;
import com.e.kushnewsapp.newsfeed.NewsPreferences;
import com.e.kushnewsapp.R;

import java.util.List;

/**
 * The WorldFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class WorldFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = WorldFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String worldUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.world));
        Log.e(LOG_TAG, worldUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), worldUrl);
    }
}