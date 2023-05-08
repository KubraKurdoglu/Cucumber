Feature: US002_Amazon_Sayfasinda_Urun_Aratma


  #Class'larimizda kullandigimiz @Before gibi burda da her scnerio'dan once Background yapisi calsiir
  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

     #Feature file'da birden fazla ürün aratmak için her seferinde yeni bir method oluşturmak gerekir.
  #Dolayısıyla stepdefinition class'ında çok fazla method oluşturmuş oluruz
  #Tek bir parametreli method oluşturup bunun üstesinden gelebiliriz.
     #Bunun için feature file'da aratmak istediğimiz metni " " tırnak içinde yazarsak stepdefinition class'ında bize
  #parametleri method oluşturur.

  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
    Then arama_kutusunda_"Selenium"_aratir
    And kullanici_3_saniye_bekler

  Scenario: TC02_Amazon_Sayfasinda_Github_Aratma
    Then arama_kutusunda_"github"_aratir
    And kullanici_2_saniye_bekler

  Scenario: TC03_Amazon_Sayfasinda_Samsung_Aratma
    Then arama_kutusunda_"samsung"_aratir
    And kullanici_2_saniye_bekler

  Scenario: TC01_Amazon_Sayfasinda_Nokia_Aratma
    Then arama_kutusunda_"nokia"_aratir
    And kullanici_2_saniye_bekler
    And sayfayi_kapatir