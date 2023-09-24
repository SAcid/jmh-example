package com.example.jmhexample.novel.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FreeNovelGroup {
  FREE_1("free_1"),
  FREE_2("free_2"),
  FREE_3("free_3"),
  FREE_4("free_4")
  ;

  private final String code;

  public static List<String> codeList() {
    return Arrays.stream(FreeNovelGroup.values()).map(FreeNovelGroup::getCode).toList();
  }

  public static Set<String> codeSet() {
    return Arrays.stream(FreeNovelGroup.values()).map(FreeNovelGroup::getCode).collect(Collectors.toSet());
  }

  private static final List<String> CODES = codeList();
  private static final Set<String> SETS = codeSet();
  public static boolean contains(String code) {
    return SETS.contains(code);
  }

}
