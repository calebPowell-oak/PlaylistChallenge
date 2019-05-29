package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer upCount = 0;
        Integer downCount = 0;
        Integer index = startIndex;
        while(!playList[index].equals(selection)){
            index--;
            if(index < 0){
                index = playList.length - 1;
            }
            downCount++;
        }
        index = startIndex;
        while(!playList[index].equals(selection)){
            index++;
            if(index > playList.length - 1){
                index = 0;
            }
            upCount++;
        }
        return downCount < upCount ? downCount : upCount;
    }
}
