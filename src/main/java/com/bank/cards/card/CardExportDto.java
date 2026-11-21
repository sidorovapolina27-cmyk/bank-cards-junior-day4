package com.bank.cards.card;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Экспортный дто карты для партнёрского канала.
 *
 * Требования контракта:
 * - ключи JSON в snake_case;
 * - даты в формате dd.MM.yyyy;
 * - внутренний риск-скор наружу не отдаётся.
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CardExportDto {

    private final String pan;
    private final String cardHolderName;
    private final LocalDate validFrom;
    private final LocalDate validTo;
    private final CardStatus status;
    private final String productName;
    private final int internalRiskScore;
}
