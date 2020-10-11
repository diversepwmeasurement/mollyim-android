package com.google.android.gms.maps;

import android.graphics.Bitmap;

import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMap {
  public static final int MAP_TYPE_NORMAL = 1;

  public UiSettings getUiSettings() {
    return new UiSettings();
  }

  public void setBuildingsEnabled(boolean b) {
  }

  public void addMarker(MarkerOptions position) {
  }

  public void moveCamera(CameraUpdate update) {
  }

  public void setMapType(int type) {
  }

  public void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
  }

  public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
  }

  public void setOnCameraMoveStartedListener(GoogleMap.OnCameraMoveStartedListener listener) {
  }

  public CameraPosition getCameraPosition() {
    return new CameraPosition();
  }

  public void setOnCameraIdleListener(GoogleMap.OnCameraIdleListener listener) {
  }

  public void setMyLocationEnabled(boolean b) {
  }

  public interface SnapshotReadyCallback {
    void onSnapshotReady(Bitmap bitmap);
  }

  public interface OnMapLoadedCallback {
    void onMapLoaded();
  }

  public interface OnCameraMoveStartedListener {
    void onCameraMoveStarted(int reason);
  }

  public interface OnCameraIdleListener {
    void onCameraIdle();
  }
}
