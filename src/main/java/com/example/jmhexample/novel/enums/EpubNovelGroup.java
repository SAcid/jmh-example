package com.example.jmhexample.novel.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EpubNovelGroup {
  EPUB_1("epub_1"),
  EPUB_2("epub_2"),
  EPUB_3("epub_3"),
  EPUB_4("epub_4")
  ;

  private final String code;
  public static List<String> codeList() {
    return Arrays.stream(EpubNovelGroup.values()).map(EpubNovelGroup::getCode).toList();
  }

  public static Set<String> codeSet() {
    return Arrays.stream(EpubNovelGroup.values()).map(EpubNovelGroup::getCode).collect(Collectors.toSet());
  }
  private static final List<String> CODES = codeList();
  private static final Set<String> SETS = codeSet();
  public static boolean contains(String code) {
    return  SETS.contains(code);
  }
}
