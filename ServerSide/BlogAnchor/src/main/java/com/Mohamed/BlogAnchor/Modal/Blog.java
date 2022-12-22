package com.Mohamed.BlogAnchor.Modal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private LocalDate date;
    private Writer writer;
    private String header;
    private String body;
}
