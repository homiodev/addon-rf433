package org.homio.bundle.rf433.model;

import org.homio.bundle.api.ui.field.UIField;

import javax.persistence.Entity;

@Entity
// TODO: what is this???
public class RF433SignalEntity extends RF433DeviceEntity {

  @UIField(order = 10, hideInEdit = true)
  private String path;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
