package org.homio.bundle.rf433.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.homio.bundle.api.entity.DeviceBaseEntity;

import javax.persistence.Entity;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
/*@UISidebarMenu(
        icon = "fa-broadcast-tower",
        parent = UISidebarMenu.TopSidebarMenu.HARDWARE,
        templateUrl = "items",
        allowCreateNewItems = false,
        order = 2,
        showInScriptDialog = true)*/
public class RF433DeviceEntity extends DeviceBaseEntity<RF433DeviceEntity> {

  @Override
  public String getEntityPrefix() {
    return "rf433_";
  }

  @Override
  public String getDefaultName() {
    return "433";
  }
}
