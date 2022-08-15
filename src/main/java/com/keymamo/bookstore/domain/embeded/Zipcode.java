package com.keymamo.bookstore.domain.embeded;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Zipcode {
    String zip;
    String plusFour;
}
