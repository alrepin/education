package ga.repin.education.course02.topic11.hw.orders;

import ga.repin.education.common.exceptions.ErrorMessage;
import ga.repin.education.common.exceptions.HttpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

import static ga.repin.education.course02.topic11.hw.HwConstants.HW_ENDPOINT;

//@CrossOrigin
@RequestMapping(HW_ENDPOINT)
@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleException(Exception exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorMessage(HttpStatus.BAD_REQUEST,exception.getMessage()));
    }

    @ExceptionHandler(HttpException.class)
    public ResponseEntity<ErrorMessage> handleException(HttpException exception) {
        return ResponseEntity
                .status(exception.getHttpStatus())
                .body(new ErrorMessage(exception.getHttpStatus(),exception.getMessage()));
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping()
    public String index(HttpSession session) {
        return orderService.index(session.getId());
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/add")
    public void addItem(@RequestParam(value = "ids", required = false) List<Integer> idList) {
        orderService.add(idList);
    }

    @GetMapping(path = "/get")
    public Object getItems() {
        return orderService.get();
    }
}
