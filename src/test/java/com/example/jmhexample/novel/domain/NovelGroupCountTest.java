package com.example.jmhexample.novel.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NovelGroupCountTest {

  @Test
  void v1() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_1() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_1(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_2() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_2(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_3() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_3(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_4() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_4(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_5() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_5(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v1_6() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v1_6(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_1() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_1(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_2() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_2(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_3() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_3(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_4() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_4(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_5() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_5(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_6() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_6(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_7() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_7(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_8() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_8(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  @Test
  void v2_9() {
    NovelGroupCount novelGroupCount = NovelGroupCount.v2_9(TEST_DATA);
    assertThat(novelGroupCount).isEqualTo(new NovelGroupCount(16, 4, 4, 4, 4));
  }

  private static final List<String> TEST_DATA = List.of(
      "free_1", "free_2", "free_3", "free_4", "paid_1", "paid_2", "paid_3", "paid_4", "ebook_1",
      "ebook_2", "ebook_3", "ebook_4", "epub_1", "epub_2", "epub_3", "epub_4"
  );
}