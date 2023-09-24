package com.example.jmhexample.novel.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaidNovelGroup {
  PAID_1("paid_1"),
  PAID_2("paid_2"),
  PAID_3("paid_3"),
  PAID_4("paid_4")
  ;

  private final String code;

  public static List<String> codeList() {
    return Arrays.stream(PaidNovelGroup.values()).map(PaidNovelGroup::getCode).toList();
  }

  public static Set<String> codeSet() {
    return Arrays.stream(PaidNovelGroup.values()).map(PaidNovelGroup::getCode).collect(Collectors.toSet());
  }
  private static final List<String> CODES = codeList();
  private static final Set<String> SETS = codeSet();
  public static boolean contains(String code) {
    return SETS.contains(code);
  }
}
