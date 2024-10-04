package com.tarikhmrt.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder //Bir sınıftan nesne türetmek için
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString //Nesne bilgisini terminalde yazdırır.
public class BaseEntity {

    Long createAt;

    Long updateAt;

    boolean state;

}
