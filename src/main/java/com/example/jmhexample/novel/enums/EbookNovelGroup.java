package com.example.jmhexample.novel.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EbookNovelGroup {
  EBOOK_1("ebook_1"),
  EBOOK_2("ebook_2"),
  EBOOK_3("ebook_3"),
  EBOOK_4("ebook_4")
  ;

  private final String code;

  public static List<String> codeList() {
    return Arrays.stream(EbookNovelGroup.values()).map(EbookNovelGroup::getCode).toList();
  }

  public static Set<String> codeSet() {
    return Arrays.stream(EbookNovelGroup.values()).map(EbookNovelGroup::getCode).collect(Collectors.toSet());
  }
  private static final List<String> CODES = codeList();
  private static final Set<String> SETS = codeSet();
  public static boolean contains(String code) {
    return  SETS.contains(code);
  }
}
