package com.mapeando.territory.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "territory")
public class Territory {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "briefDescription")
    private String briefDescription;

    @Field(name = "history")
    private String history;

    @Field(name = "cartografia")
    private String cartografia;

    @Field(name = "religion")
    private String religion;

    @Field(name = "extra_content")
    private String extra_content;

    @Field(name = "mainImage")
    private byte[] mainImage;

    @Field(name = "map")
    private String map;

}
