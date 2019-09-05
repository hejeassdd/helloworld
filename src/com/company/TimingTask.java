package com.company;

import java.util.*;

/**
 *  测试国栋的时间任务
 */
public class TimingTask {

    public static void main(String[] args) {
        List<Map<String, Object>> maps = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id","00d1eeb2345f40d584fc39628d63a369");
        map1.put("days",20);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("id","38fb4488d80d43f29f175b15f19e1835");
        map2.put("days",13);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("id","62c5a21079ab46858352692144459f4f");
        map3.put("days",52);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("id","b806366a18044100b812420c7ebc4542");
        map4.put("days",6);
        Map<String, Object> map5 = new HashMap<>();
        map5.put("id","dc6b72a1b58e45ebb43c04b36357fe98");
        map5.put("days",-1);
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);

        getRecentPeriodFlagList(maps);


    }

    public static List<Map<String, Object>> getRecentPeriodFlagList(List<Map<String, Object>> maps){
        //1获取该用户所有还款计划
//        List<Map<String, Object>> maps = goalOrderRepayPlanMapper.getDataForUpdateRecentPeriodFlagByUid(uid);
        //2.取出最近一期的id
        boolean flag = false;
        String currentId = "";
        List<Integer> tempList = new ArrayList<>();
        if(maps != null && maps.size() > 0){
            flag = true;
            for(int i=0;i<maps.size();i++){
                Integer tmpDays = Integer.valueOf(maps.get(i).get("days").toString());
                if(tmpDays<0){
                    tempList.add(tmpDays);
                }
            }
        }
        if(tempList!=null && tempList.size()>0){
            Integer max = Collections.max(tempList);
            for (int i = 0; i < maps.size(); i++) {
                if(maps.get(i).get("days")==max){
                    currentId= (String) maps.get(i).get("id");
                }
            }
        }


        //3.拼接更新所需参数
        List<Map<String, Object>> lists = new ArrayList<>();
        if(flag){
            for(Map<String, Object> map:maps){
                Map<String, Object> param = new HashMap();
                if(currentId.equalsIgnoreCase(map.get("id").toString())){
                    param.put("id", currentId);
                    param.put("recentPeriodFlag", 1);
                }else{
                    param.put("id", map.get("id").toString());
                    param.put("recentPeriodFlag", 0);
                }
                lists.add(param);
            }
        }
        return lists;
    }
}
