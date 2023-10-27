import time
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Edge()

driver.get("https://www.google.com")
driver.maximize_window()

driver.find_element(By.NAME, "q").send_keys("javatpoint")
time.sleep(3)
