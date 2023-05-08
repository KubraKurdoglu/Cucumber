Feature: Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"https://google.com"_sayfasina_gider

    Scenario Outline: Google_Aramalazri
      * kullanici googleda "<aranacakKelime>" aratir
      * basligin "<aranacakKelime>" icerdigini dogrular
      * sayfayi_kapatir

      Examples:
        | aranacakKelime |
        |volvo|
        | bmv |
        | mercedes|
        |audi |
        | ford|
        | renault |