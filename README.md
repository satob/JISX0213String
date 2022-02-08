# JISX0213String

Library to handle JIS X 0213 Characters in strings

- This library (JISX0213String.java) is relatively small, because it uses
  x-SJIS_0213 Encoding object contained in JDK and does not contain
  the whole definition of JIS X 0213 character set.
- This library handles non-kanji characters in JIS X 0213 collectly.
  The existing implementation of JIS X 0213 validator (e.g. JIS_X_0213_Kanji.java
  in TERASOLUNA) does not contain definitions of non-kanji characters in JIS X 0213.
