// Generated by data binding compiler. Do not edit!
package com.example.cleanarchitecturestudy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.cleanarchitecturestudy.R;
import com.example.cleanarchitecturestudy.view.search.MovieSearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMovieSearchBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSearch;

  @NonNull
  public final Button btnSearchFlow;

  @NonNull
  public final EditText etInput;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RecyclerView rvMovies;

  @Bindable
  protected MovieSearchViewModel mVm;

  protected ActivityMovieSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSearch, Button btnSearchFlow, EditText etInput, Guideline guideline,
      ProgressBar pbLoading, RecyclerView rvMovies) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSearch = btnSearch;
    this.btnSearchFlow = btnSearchFlow;
    this.etInput = etInput;
    this.guideline = guideline;
    this.pbLoading = pbLoading;
    this.rvMovies = rvMovies;
  }

  public abstract void setVm(@Nullable MovieSearchViewModel vm);

  @Nullable
  public MovieSearchViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static ActivityMovieSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieSearchBinding>inflateInternal(inflater, R.layout.activity_movie_search, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieSearchBinding>inflateInternal(inflater, R.layout.activity_movie_search, null, false, component);
  }

  public static ActivityMovieSearchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMovieSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMovieSearchBinding)bind(component, view, R.layout.activity_movie_search);
  }
}
