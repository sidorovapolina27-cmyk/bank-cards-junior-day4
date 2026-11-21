package com.bank.cards.card;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CardShortDto {

    private final Long id;
    private final String maskedPan;
    private final CardStatus status;
    private final String statusDisplayName;
    private final String productName;
}
