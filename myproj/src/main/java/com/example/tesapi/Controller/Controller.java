
@RestController
@RequestMapping('/api/)
Class Controller {

    @GetMapping
    public void testApi() {
        return "heLLo WorLD!!";
    }
}