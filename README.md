# ServletRequestDispatching
# FifthServletApp - Pw SKills Registration page using servlet
The servlet provides a user-friendly registration confirmation page in response to the form submission.
It dynamically generates HTML content based on the user's input and sends it as an HTTP response.
When a user submits the registration form, this servlet processes the form data, generates an HTML response, and sends it back to the user's web browser for display.

<img width="960" alt="image" src="https://github.com/VaishnaviSh14/ServletRequestDispatching/assets/123576868/f1b2f795-171f-4790-9281-c1410c606cb3">

<img width="959" alt="image" src="https://github.com/VaishnaviSh14/ServletRequestDispatching/assets/123576868/b64859ac-615a-427d-be45-7d2a004058fe">

# Request Dispatching mechanism
1. using include
2. using forward
   
# using forward
=============
forward
=> To transfer the request to one more component then we need to use forward
approach.

RequestDispatcher rd = request.getRequestDispatcher("/second");
rd.forward(request, response);

The above line would take the control from the currently executed resource to the
specified resource.

# using include
+++++++++++++
=> Incase of include approach the container will not remove the response added by
first component rather the container will add
the response from the first resource and it will forward it to second resource.
=> The response will be from
TotalResponse = FirstResource + SecondResource

# RequestDispatching -002

<img width="960" alt="image" src="https://github.com/VaishnaviSh14/ServletRequestDispatching/assets/123576868/9ed061f6-b124-4dcd-891c-1124fb7a91ea">

<img width="958" alt="image" src="https://github.com/VaishnaviSh14/ServletRequestDispatching/assets/123576868/5fefa19c-7f7b-4cde-b0e8-5af50aef52be">

<img width="959" alt="image" src="https://github.com/VaishnaviSh14/ServletRequestDispatching/assets/123576868/f3a66820-c5b8-4752-aa23-f7c15cdf2cc8">



