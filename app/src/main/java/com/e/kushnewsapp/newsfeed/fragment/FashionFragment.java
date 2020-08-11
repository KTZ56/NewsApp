package com.e.kushnewsapp.newsfeed.fragment;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.loader.content.Loader;

import com.e.kushnewsapp.newsfeed.News;
import com.e.kushnewsapp.newsfeed.NewsLoader;
import com.e.kushnewsapp.newsfeed.NewsPreferences;
import com.e.kushnewsapp.R;

import java.util.List;

/**
 * The FashionFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class FashionFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = FashionFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String fashionUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.fashion));
        Log.e(LOG_TAG, fashionUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), fashionUrl);
    }
}