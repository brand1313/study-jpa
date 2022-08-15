package com.keymamo.bookstore.domain.embeded;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Address {
    String street;
    String city;
    String state;
    @Embedded Zipcode zipcode;
}


