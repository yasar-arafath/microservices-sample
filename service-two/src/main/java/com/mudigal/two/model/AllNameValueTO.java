package com.mudigal.two.model;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * @author Yasar Arafat
 */
@Data
public class AllNameValueTO {

  private String originalName;
  private String originalValue;
  private Map<String, String> remainingNameValuePair = new HashMap<>();

}
