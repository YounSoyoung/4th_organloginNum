package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectOrganLogin(String organ, String date);
 
}
