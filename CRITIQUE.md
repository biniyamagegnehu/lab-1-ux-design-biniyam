# H-CASH Application: UI/UX Critique

## 1. Introduction

This document presents a UI/UX critique of H-CASH, an Ethiopian mobile financial services application associated with Shabelle Bank.

The purpose of this critique is to examine two design references:

1. The previous student's H-CASH mobile application design, inherited from the original GitHub repository.
2. Screenshots of the H-CASH Customer App obtained from its Google Play Store listing.

The evaluation focuses on visual design, usability, accessibility, navigation, and the overall organization of the application's screens.

The objective is not simply to identify design weaknesses but also to recognize effective design decisions and identify opportunities for meaningful improvement.

The findings will be used to develop a focused redesign proposal and implement the proposed screens using Android Studio XML layouts.

## 2. Scope and Methodology

### 2.1 Materials examined

The critique is based on the following materials:

| Material | Purpose |
|---|---|
| `H-cash.png` | Previous student's H-CASH design |
| `Mobileapp.jpg` | Original project design material |
| `README.md` | Original assignment instructions and project information |
| `ux.pdf` | Tutorial about creating mobile wireframes using draw.io |
| Google Play Store screenshots | Visual reference for the H-CASH Customer App |

### 2.2 Evaluation approach

The evaluation uses screenshot-based inspection and comparative visual analysis.

The following areas were considered:

- Layout, spacing, and alignment.
- Color palette and visual contrast.
- Typography and readability.
- Iconography and visual consistency.
- Organization of application features.
- Navigation and screen relationships.
- Input forms and user guidance.
- Accessibility considerations.
- Availability of visible feedback and interface states.

### 2.3 Research limitations

The H-CASH Customer App was not personally installed or tested during this evaluation. The real-application analysis is based on screenshots obtained from its Google Play Store listing.

Consequently:

- Actual navigation behavior could not be tested.
- The number of taps required to complete transactions could not be measured.
- Login, registration, deposit, withdrawal, and payment workflows could not be completed experimentally.
- Loading, error, empty, and transaction confirmation states could not be inspected.
- Accessibility behavior and performance on low-end devices were not tested.
- The screenshots may not represent every screen or the latest version of the application.

Therefore, observations about the real application are limited to its visible interface. Potential usability problems are identified as design concerns rather than confirmed user difficulties.

## 3. Overview of the Two Designs

### 3.1 Previous student's design

The previous student's design contains eight screens:

1. Login
2. Sign Up
3. Personal Information
4. Phone Verification
5. Registration Success
6. Additional Phone Verification
7. Home Dashboard
8. Transactions

The design uses a dark navy-blue background with yellow/gold buttons and branding. It includes an account registration process, identity verification, phone verification, a home dashboard, and a transaction history interface.

### 3.2 H-CASH application screenshots

The Google Play Store screenshots show seven interface examples:

1. Login
2. Home Dashboard
3. Merchant Payment
4. Deposit Options
5. Bank Selection
6. Airtime
7. Withdraw

The screenshots show a financial services interface with a dark navy-blue background, gold-colored elements, and several banking operations.

The dashboard provides shortcuts to services such as Merchant, Send, Airtime, and Withdraw. Additional screens show forms for merchant payments, deposits, and withdrawals.

### 3.3 Comparative overview

| Feature | Previous student's design | Google Play Store screenshots |
|---|---|---|
| Login | Available | Available |
| Account registration | Detailed registration screen | Not shown |
| Identity verification | ID and face verification | Not shown |
| Phone verification | Two verification screens | Not shown |
| Home dashboard | Available | Available |
| Merchant payment | Dashboard shortcut | Dedicated payment form |
| Deposit | Not shown | Dedicated deposit interface |
| Bank selection | Not shown | Available |
| Airtime | Dashboard shortcut | Dedicated airtime screen |
| Withdrawal | Dashboard shortcut | Dedicated withdrawal form |
| Transaction history | Available | Not shown |

The two designs focus on different aspects of the application. The previous student's design gives more attention to account onboarding and transaction history, while the Play Store screenshots provide more detail about financial service operations.

The absence of a particular screen in the supplied screenshots does not establish that the real application lacks that functionality.

## 4. UI Critique: How the Application Looks

### 4.1 Color palette and visual identity

Both designs use navy blue and yellow/gold as their primary visual colors.

**Strengths:**

- The repeated use of navy blue and gold creates a recognizable visual identity.
- Gold-colored buttons and important interface elements stand out against the dark background.
- The H-CASH branding is visible across multiple screens.
- The general color scheme is maintained across the supplied designs.

**Weaknesses and opportunities:**

- Large dark backgrounds are used throughout many screens, which may make long forms feel visually dense.
- Some text and supporting instructions appear relatively small.
- The contrast and readability of secondary text should be evaluated more carefully.
- The designs could benefit from more consistent use of lighter surfaces to separate different content sections.

**Recommendation:**

Preserve the navy-blue and gold identity while improving text contrast, introducing more balanced background surfaces, and creating clearer distinctions between primary and secondary interface elements.

### 4.2 Layout, spacing, and alignment

**Previous student's design:**

The login and registration screens use relatively simple vertical layouts. However, the verification screens and dashboard contain several elements with limited spacing.

The home dashboard includes service shortcuts, promotional content, wallet information, and bottom navigation.

**Google Play Store screenshots:**

The real-app dashboard presents several financial services in a compact arrangement. The Merchant Payment, Deposit, and Withdraw screens use vertically arranged forms.

**Weaknesses and opportunities:**

- Some dashboard elements appear closely grouped.
- Form fields and their labels could have more consistent spacing.
- The hierarchy between screen headings, instructions, input fields, and buttons could be stronger.
- Some screens could use better grouping to separate related information.

**Recommendation:**

Use consistent spacing rules, group related elements, and provide sufficient separation between interactive components.

### 4.3 Typography and readability

Several screens contain small labels and supporting text.

For example:

- The previous student's phone verification screen has small explanatory text.
- The dashboard contains compact labels beneath service icons.
- The deposit and withdrawal screens use relatively small supporting instructions.

This may make information harder to read, particularly on smaller displays.

**Recommendation:**

- Use a consistent typography scale.
- Give screen titles stronger visual prominence.
- Make form labels and instructions readable.
- Use appropriate text contrast.
- Use scalable text sizes rather than relying on unnecessarily small fixed text.

### 4.4 Iconography

The designs use icons to represent services such as sending money, merchant payments, airtime, withdrawal, and other banking operations.

**Strengths:**

- Icons make the dashboard more visually recognizable.
- They help communicate the purpose of common services.
- Repeated icon use supports visual consistency.

**Weaknesses and opportunities:**

- Some icons are accompanied by relatively small labels.
- The relationship between certain icons and their actions may not be immediately obvious to every user.
- Icon size, alignment, and surrounding spacing could be more consistent.

**Recommendation:**

Use familiar and consistent icons, maintain adequate icon sizes, and always provide descriptive text labels for important actions.

## 5. UX Critique: How the Application Works

### 5.1 Login and registration

The previous student's design includes a login screen with phone number and password fields, a login button, and a sign-up link.

The registration process includes:

- Regional location.
- Name.
- Phone number.
- Identity document upload.
- Face verification.
- PIN creation and confirmation.
- Phone verification.

**Strengths:**

- The design considers both existing and new users.
- Identity verification is included in the proposed registration experience.
- Phone verification is represented as part of account onboarding.

**Weaknesses and opportunities:**

- The relationship between registration success and the additional phone verification screen is unclear.
- The registration process does not visibly communicate the user's progress.
- The identity verification screen combines several different tasks without a clear visual separation.
- The purpose and requirements of each verification step could be explained more clearly.

**Recommendation:**

Create a consistent onboarding sequence with clearly explained steps, visible progress, and understandable instructions.

### 5.2 Home dashboard and navigation

The Google Play Store dashboard screenshot displays:

- Wallet balance.
- Merchant payment.
- Send money.
- Airtime.
- Withdraw.
- Flight.
- Bills.
- Promotional content.
- Bottom navigation.

The previous student's dashboard contains several similar service shortcuts and a bottom navigation bar.

**Strengths:**

- Important financial services are accessible from the home screen.
- The dashboard provides a central location for accessing different services.
- Bottom navigation offers a recognizable way to access major application sections.

**Weaknesses and opportunities:**

- Several service shortcuts compete for visual attention.
- The dashboard contains multiple types of content, including balance information, transactions, services, and promotions.
- The visual hierarchy could better distinguish frequently used financial operations from secondary services.
- Some service labels are small.

**Recommendation:**

Organize the dashboard into clearly defined sections. Give frequently used financial operations greater visual priority and separate promotional content from essential banking actions.

### 5.3 Merchant payment

The supplied Merchant Payment screenshot contains:

- Merchant code.
- Amount.
- Narration.
- Submit button.

**Strengths:**

- The payment form is relatively straightforward.
- The required information is presented in separate input fields.
- The submit action is visually distinguishable.

**Weaknesses and opportunities:**

- The form could provide clearer explanations for each field.
- It is not possible to determine from the screenshot how invalid inputs are handled.
- The screenshot does not show a transaction review or confirmation state.

**Recommendation:**

Use persistent field labels, clear validation messages, and an understandable confirmation step before completing a payment.

These are proposed improvements; the actual behavior of the payment workflow was not tested.

### 5.4 Deposit and bank selection

The supplied screenshots show deposit options and a bank-selection interface.

The deposit screen presents different deposit methods, account number, amount, and narration fields.

The bank-selection screen includes a search field and a list of banks.

**Strengths:**

- Different deposit methods are visually presented.
- Bank selection is separated from the deposit form.
- The search field can help users find a bank.

**Weaknesses and opportunities:**

- The deposit options could communicate their differences more clearly.
- Bank entries contain several pieces of information in a relatively compact layout.
- Search and selection states are not demonstrated in the screenshots.
- The screenshots do not show what happens when a search returns no results or when an account number is invalid.

**Recommendation:**

Use clearly differentiated deposit options, readable bank entries, visible selection states, and informative empty and validation states.

### 5.5 Airtime

The Airtime screen displays two mobile service providers: Safaricom and Ethio Telecom.

**Strengths:**

- Provider selection is presented as a separate step.
- Each provider has a visual identifier.
- The interface uses a simple list structure.

**Weaknesses and opportunities:**

- Provider descriptions appear relatively small.
- The screenshots do not show the subsequent airtime purchase process.
- The selected provider state is not clearly demonstrated.

**Recommendation:**

Make provider selection more obvious, improve readability, and clearly communicate the selected provider before the user proceeds.

### 5.6 Withdrawal

The withdrawal screen includes:

- Agent/Teller ID.
- Amount.
- Narration.
- Submit button.

**Strengths:**

- The required information is grouped in one form.
- The submit button is easy to identify.
- The form avoids unnecessary visual elements.

**Weaknesses and opportunities:**

- Field instructions could be clearer.
- Input validation and error handling are not demonstrated.
- There is no visible review or confirmation state in the supplied screenshot.

**Recommendation:**

Provide clear field labels, input guidance, validation feedback, and a confirmation interface for reviewing withdrawal information.

### 5.7 Transaction history

The previous student's design includes a Transactions screen with filtering options such as:

- My Activity.
- Filter by Customer.
- Mini Statement.
- Email My Activity.

**Strengths:**

- The design recognizes the importance of transaction history.
- Filtering options are provided.
- Different activity-related functions are grouped together.

**Weaknesses and opportunities:**

- The relationship between filtering options and transaction results is not clearly demonstrated.
- The filter interface could communicate selection states more clearly.
- The screenshot does not show how transaction records are displayed or how empty results are handled.

**Recommendation:**

Create a structured transaction history interface with readable transaction information, clear filtering controls, and understandable empty states.

## 6. Accessibility and Usability Considerations

Accessibility is an important consideration for financial applications because users need to understand information and interact with financial operations accurately.

The supplied screenshots allow visual inspection, but they do not provide enough information to confirm the actual accessibility behavior of the application.

The following areas require attention in the redesigned interface:

| Accessibility area | Design consideration |
|---|---|
| Touch targets | Interactive controls should have touch areas of at least 48dp. |
| Typography | Text should remain readable on smaller devices. |
| Color contrast | Important text and actions should have sufficient contrast. |
| Form labels | Fields should have clear labels instead of depending only on placeholder text. |
| Icons | Important icons should have descriptive text labels. |
| Feedback | Errors and successful actions should be communicated clearly. |
| Screen sizes | Layouts should adapt to different mobile display sizes. |

The redesigned screens should address these considerations during Android XML implementation.

## 7. Low-End Devices and Weak Network Considerations

The supplied screenshots cannot establish the application's actual performance on low-end devices or under weak network conditions.

However, these are important design considerations for an Ethiopian mobile financial services application.

The redesign should consider:

- Keeping the interface visually simple.
- Avoiding unnecessary large illustrations and decorative elements.
- Using optimized images and icons.
- Providing clear feedback while operations are processing.
- Designing understandable error states when network connectivity is unavailable.
- Avoiding unnecessary steps during common tasks.

The interface should communicate the status of important operations without requiring users to guess whether an action has succeeded.

## 8. Future of Mobile Applications and UX Design

Modern mobile application design should prioritize simplicity, accessibility, user-centered design, and clear communication.

For a financial services application, this means:

- Designing interfaces around users' actual financial tasks.
- Reducing unnecessary complexity in important workflows.
- Providing meaningful feedback during financial operations.
- Making information understandable to users with different levels of technical experience.
- Considering accessibility and different device capabilities.
- Maintaining user confidence through clear and consistent interaction patterns.

The redesign should follow these principles rather than focusing only on visual appearance.

**Class discussion connection:** The specific topics discussed in class about the future of applications should be added here after reviewing the relevant lecture notes. They have not been supplied for this critique, so no particular class discussion is attributed or invented.

## 9. Main Strengths and Weaknesses

### 9.1 Main strengths

1. Both designs maintain a recognizable H-CASH visual identity.
2. The dashboard provides access to several important financial services.
3. Dedicated interfaces are provided for merchant payments, deposits, and withdrawals in the Play Store screenshots.
4. Bank selection includes a search interface.
5. The previous student's design considers account registration and identity verification.
6. The previous student's design includes a transaction history and filtering interface.

### 9.2 Main weaknesses and improvement opportunities

1. The previous student's registration and phone verification sequence is not clearly organized.
2. Several screens use relatively small supporting text.
3. The dashboard contains many competing service shortcuts.
4. Form labels and instructions could be clearer.
5. Important payment and withdrawal feedback states are not demonstrated.
6. The deposit and bank-selection interfaces could communicate selection and validation states more clearly.
7. The transaction filtering interface needs clearer organization and feedback.
8. Accessibility cannot be established from the available screenshots and needs to be addressed in the redesign.

## 10. Prioritized Problems

The following problems are prioritized based on their potential impact on user understanding and interaction.

| Priority | Identified problem | Affected screen | Reason for priority |
|---|---|---|---|
| High | Unclear registration and verification sequence | Sign Up, Personal Information, Phone Verification, Registration Success | Users need a clear and understandable account onboarding process. |
| High | Limited visible validation and confirmation states | Merchant Payment, Deposit, Withdraw | Financial operations require clear feedback and understandable actions. |
| Medium | Crowded service organization | Home Dashboard | Important services should be easier to identify. |
| Medium | Small labels and supporting text | Dashboard, forms, verification | Readability affects users' ability to understand the interface. |
| Medium | Unclear bank selection states | Deposit and Bank Selection | Users should understand which option they have selected. |
| Medium | Limited transaction filter feedback | Transactions | Users need to understand the results of their filtering actions. |

These priorities are based on the available visual evidence and design considerations, not measured user testing.

## 11. Conclusion

The comparison between the previous student's H-CASH design and the supplied Google Play Store screenshots shows that the two designs emphasize different parts of the financial application.

The previous student's design focuses on account onboarding, identity verification, and transaction history. The Play Store screenshots provide additional visual detail about the dashboard and financial operations such as merchant payments, deposits, airtime purchases, and withdrawals.

Both designs establish a consistent navy-blue and gold visual identity and demonstrate the importance of providing access to essential financial services.

However, there are opportunities to improve visual hierarchy, form readability, screen organization, accessibility, and the communication of important interaction states.

The most important next step is to select a focused improvement based on these findings and justify it in `PROPOSAL.md`.

The redesigned interface will be implemented using Android Studio XML layouts, following mobile-first design principles and the assignment's accessibility and preview requirements.

## 12. Sources and Evidence

1. Previous student's H-CASH design: `H-cash.png`, supplied in the original GitHub repository.
2. Previous project design material: `Mobileapp.jpg`, supplied in the original GitHub repository.
3. H-CASH Customer App screenshots: obtained from the Google Play Store listing and supplied for this assignment.
4. Original assignment README: `README.md`, supplied in the original GitHub repository.
5. Wireframing tutorial: `ux.pdf`, supplied in the original GitHub repository.

**Research disclosure:** This critique was prepared using the supplied design materials and publicly available screenshots. The application was not personally installed or tested. Findings about actual application behavior are therefore limited to what can be established from the available evidence.