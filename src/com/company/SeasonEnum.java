package com.company;

public enum SeasonEnum {

    SPRING("春天",1),
    SUMMER("夏天",2),
    FALL("秋天",3),
    WINTER("冬天",4);

    private final String name;
    private final int status;

    private SeasonEnum(String name,int status)
    {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getStatus(){
        return status;
    }

    public static SeasonEnum getByName(int status){
        if(status<=0){
            return null;
        }
        for (SeasonEnum s:SeasonEnum.values()) {
            if(s.getStatus()==status){
                return s;
            }

        }
        throw new IllegalArgumentException(String.format("No matching constant for [%s]",status));
    }


}
