Feature: US001_Amazon_Sayfasinda_Urun_Aratma

  #Class'larimizda kullandigimiz @Before gibi burda da her scnerio'dan once Background yapisi calsiir
  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
      Then arama_kutusunda_Selenium_aratir


  Scenario: TC02_Amazon_Sayfasinda_Java_Aratma
     When arama_kutusunda_Java_aratir

  Scenario: TC03_Amazon_Sayfasinda_Java_Aratma
     When arama_kutusunda_sql_aratir