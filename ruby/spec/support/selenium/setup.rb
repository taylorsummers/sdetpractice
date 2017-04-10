require 'selenium-webdriver'
module Selenium::Setup
  def initialize_selenium( browser = :firefox )
    @driver = Selenium::WebDriver.for browser
    @wait = Selenium::WebDriver::Wait.new(:timeout => 60)
  end
end

RSpec.configure do |config|
  config.include Selenium::Setup
end
