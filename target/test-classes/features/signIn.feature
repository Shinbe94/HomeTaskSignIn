Feature: Sign-in feature
  I want test sign-in feature of the page https://cp.qc.coccoc.com/sign-in

	Background:
	Given user open page "https://cp.qc.coccoc.com/sign-in"
	
  @test
  Scenario: User can sign-in successfully 
    When User inputs in email field is "nhungnt1009@gmail.com" 
    And User inputs in password field is "Aa@123456" 
   	And User clicks sign-in button
   	Then User can sign-in successfully

  @test
  Scenario Outline: User sign-in is failed if username or password is wrong
    When User inputs in email field is "<email>"
    And User inputs in password field is "<password>"
    And User clicks sign-in button
    Then User cannot sign-in successfully
    And User sees message '<error message>'
    Examples: 
      | email                 | password  | error message                                                                                          | case                          |
      | test0001@gmail.com    | Aa@123456 | Email hoặc mật khẩu không đúng!                                                                        | email wrong, password correct |
      | nhungnt1009@gmail.com | abc123    | Sai mật khẩu                                                                                           | email correct, password wrong |
      | test1@gmail.com       | abc123    | Email hoặc mật khẩu không đúng!                                                                        | email wrong, password wrong   |
      | test0001              | abc123    | Email bạn nhập không hợp lệ. Vui lòng thử lại (Ví dụ: abc@example.com).                                | email wrong format            |
      | test0001              |           | Email bạn nhập không hợp lệ. Vui lòng thử lại (Ví dụ: abc@example.com).\nBắt buộc phải nhập "Mật khẩu" | email wrong format, password empty |
      |                       |           | Bắt buộc phải nhập "Email" \nBắt buộc phải nhập "Mật khẩu"                                             | email empty, password empty |
      
      
