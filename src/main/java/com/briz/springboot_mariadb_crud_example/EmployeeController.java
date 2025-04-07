package com.briz.springboot_mariadb_crud_example;

@RestController
public class EmployeeController
  {
@Autowired
    EmployeeService eserv;
    @RequestMapping("/test")
    public String test()
    {
      return "this is mariadb test only";
}
