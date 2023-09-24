package com.example.jmhexample.novel.domain;

import com.example.jmhexample.novel.enums.EbookNovelGroup;
import com.example.jmhexample.novel.enums.EpubNovelGroup;
import com.example.jmhexample.novel.enums.FreeNovelGroup;
import com.example.jmhexample.novel.enums.PaidNovelGroup;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public record NovelGroupCount(
    int total, int free, int paid, int ebook, int epub
) {

  public static NovelGroupCount v1(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FreeNovelGroup.codeList().contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (PaidNovelGroup.codeList().contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (EbookNovelGroup.codeList().contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (EpubNovelGroup.codeList().contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  private static FreeNovelGroup[] freeNovelGroups = FreeNovelGroup.values();
  private static PaidNovelGroup[] paidNovelGroups = PaidNovelGroup.values();
  private static EbookNovelGroup[] ebookNovelGroups = EbookNovelGroup.values();
  private static EpubNovelGroup[] epubNovelGroups = EpubNovelGroup.values();

  public static NovelGroupCount v1_1(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (Arrays.stream(freeNovelGroups).map(FreeNovelGroup::getCode).toList()
          .contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (Arrays.stream(paidNovelGroups).map(PaidNovelGroup::getCode).toList()
          .contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (Arrays.stream(ebookNovelGroups).map(EbookNovelGroup::getCode).toList()
          .contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (Arrays.stream(epubNovelGroups).map(EpubNovelGroup::getCode).toList()
          .contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }


  private static List<String> FREE_CODES = FreeNovelGroup.codeList();
  private static List<String> PAID_CODES = PaidNovelGroup.codeList();
  private static List<String> EBOOK_CODES = EbookNovelGroup.codeList();
  private static List<String> EPUB_CODES = EpubNovelGroup.codeList();

  public static NovelGroupCount v1_2(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FREE_CODES.contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (PAID_CODES.contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (EBOOK_CODES.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (EPUB_CODES.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v1_3(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FREE_CODES.contains(novelGroupCode)) {
        free.addAndGet(1);
      } else if (PAID_CODES.contains(novelGroupCode)) {
        paid.addAndGet(1);
      } else if (EBOOK_CODES.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      } else if (EPUB_CODES.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v1_4(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_CODES.contains(novelGroupCode)) {
        free.addAndGet(1);
      } else if (PAID_CODES.contains(novelGroupCode)) {
        paid.addAndGet(1);
      } else if (EBOOK_CODES.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      } else if (EPUB_CODES.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    }
    ;

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v1_5(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_CODES.contains(novelGroupCode)) {
        free++;
      } else if (PAID_CODES.contains(novelGroupCode)) {
        paid++;
      } else if (EBOOK_CODES.contains(novelGroupCode)) {
        ebook++;
      } else if (EPUB_CODES.contains(novelGroupCode)) {
        epub++;
      }
      total++;
    }
    ;

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v1_6(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_CODES.contains(novelGroupCode)) {
        free += 1;
      } else if (PAID_CODES.contains(novelGroupCode)) {
        paid += 1;
      } else if (EBOOK_CODES.contains(novelGroupCode)) {
        ebook += 1;
      } else if (EPUB_CODES.contains(novelGroupCode)) {
        epub += 1;
      }
      total += 1;
    }
    ;

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v2(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FreeNovelGroup.codeSet().contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (PaidNovelGroup.codeSet().contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (EbookNovelGroup.codeSet().contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (EpubNovelGroup.codeSet().contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v2_1(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (Arrays.stream(freeNovelGroups).map(FreeNovelGroup::getCode).collect(Collectors.toSet())
          .contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (Arrays.stream(paidNovelGroups).map(PaidNovelGroup::getCode).collect(Collectors.toSet())
          .contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (Arrays.stream(ebookNovelGroups).map(EbookNovelGroup::getCode).collect(Collectors.toSet())
          .contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (Arrays.stream(epubNovelGroups).map(EpubNovelGroup::getCode).collect(Collectors.toSet())
          .contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  private static Set<String> FREE_SET = FreeNovelGroup.codeSet();
  private static Set<String> PAID_SET = PaidNovelGroup.codeSet();
  private static Set<String> EBOOK_SET = EbookNovelGroup.codeSet();
  private static Set<String> EPUB_SET = EpubNovelGroup.codeSet();

  public static NovelGroupCount v2_2(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FREE_SET.contains(novelGroupCode)) {
        free.addAndGet(1);
      }
      if (PAID_SET.contains(novelGroupCode)) {
        paid.addAndGet(1);
      }
      if (EBOOK_SET.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      }
      if (EPUB_SET.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }


  public static NovelGroupCount v2_3(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    novelGroupCodes.forEach(novelGroupCode -> {
      if (FREE_SET.contains(novelGroupCode)) {
        free.addAndGet(1);
      } else if (PAID_SET.contains(novelGroupCode)) {
        paid.addAndGet(1);
      } else if (EBOOK_SET.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      } else if (EPUB_SET.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    });

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v2_4(List<String> novelGroupCodes) {
    AtomicInteger total = new AtomicInteger();
    AtomicInteger free = new AtomicInteger();
    AtomicInteger paid = new AtomicInteger();
    AtomicInteger ebook = new AtomicInteger();
    AtomicInteger epub = new AtomicInteger();

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_SET.contains(novelGroupCode)) {
        free.addAndGet(1);
      } else if (PAID_SET.contains(novelGroupCode)) {
        paid.addAndGet(1);
      } else if (EBOOK_SET.contains(novelGroupCode)) {
        ebook.addAndGet(1);
      } else if (EPUB_SET.contains(novelGroupCode)) {
        epub.addAndGet(1);
      }
      total.addAndGet(1);
    }

    return new NovelGroupCount(total.get(), free.get(), paid.get(), ebook.get(), epub.get());
  }

  public static NovelGroupCount v2_5(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_SET.contains(novelGroupCode)) {
        free++;
      } else if (PAID_SET.contains(novelGroupCode)) {
        paid++;
      } else if (EBOOK_SET.contains(novelGroupCode)) {
        ebook++;
      } else if (EPUB_SET.contains(novelGroupCode)) {
        epub++;
      }
      total++;
    }
    ;

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v2_6(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      if (FREE_SET.contains(novelGroupCode)) {
        free += 1;
      } else if (PAID_SET.contains(novelGroupCode)) {
        paid += 1;
      } else if (EBOOK_SET.contains(novelGroupCode)) {
        ebook += 1;
      } else if (EPUB_SET.contains(novelGroupCode)) {
        epub += 1;
      }
      total += 1;
    }
    ;

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v2_7(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      total += 1;
      if (FREE_SET.contains(novelGroupCode)) {
        free += 1;
        continue;
      }
      if (PAID_SET.contains(novelGroupCode)) {
        paid += 1;
        continue;
      }
      if (EBOOK_SET.contains(novelGroupCode)) {
        ebook += 1;
        continue;
      }
      if (EPUB_SET.contains(novelGroupCode)) {
        epub += 1;
      }
    }

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v2_8(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      total += 1;
      if (FreeNovelGroup.contains(novelGroupCode)) {
        free += 1;
        continue;
      }
      if (PaidNovelGroup.contains(novelGroupCode)) {
        paid += 1;
        continue;
      }
      if (EbookNovelGroup.contains(novelGroupCode)) {
        ebook += 1;
        continue;
      }
      if (EpubNovelGroup.contains(novelGroupCode)) {
        epub += 1;
      }
    }

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }

  public static NovelGroupCount v2_9(List<String> novelGroupCodes) {
    int total = 0;
    int free = 0;
    int paid = 0;
    int ebook = 0;
    int epub = 0;

    for (String novelGroupCode : novelGroupCodes) {
      total++;
      if (FreeNovelGroup.contains(novelGroupCode)) {
        free++;
        continue;
      }
      if (PaidNovelGroup.contains(novelGroupCode)) {
        paid++;
        continue;
      }
      if (EbookNovelGroup.contains(novelGroupCode)) {
        ebook++;
        continue;
      }
      if (EpubNovelGroup.contains(novelGroupCode)) {
        epub++;
      }
    }

    return new NovelGroupCount(total, free, paid, ebook, epub);
  }


}
