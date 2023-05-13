package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;    
    private String shortDescription;
    
    public GameMinDTO() {
    }

    public GameMinDTO(Game GameEntity) {
        this.id = GameEntity.getId();
        this.title = GameEntity.getTitle();
        this.year = GameEntity.getYear();
        this.imgUrl = GameEntity.getImgUrl();
        this.shortDescription = GameEntity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
