# H-CASH Application: UX Redesign Proposal

## 1. Introduction

This proposal presents a focused UI/UX improvement for H-CASH, an Ethiopian mobile financial services application associated with Shabelle Bank.

The proposal is based on the findings of `CRITIQUE.md`, which examined the previous student's H-CASH design and screenshots obtained from the H-CASH Customer App's Google Play Store listing.

The critique identified several opportunities for improvement, particularly in the organization of the registration and verification process.

The selected redesign focuses on improving the account registration and verification experience through three redesigned mobile screens.

The implementation will use Android Studio XML layouts, Kotlin where necessary for simple visual navigation, and supporting Android resources.

## 2. Identified Problem

### 2.1 Main problem

The previous student's design presents account registration and verification across multiple screens, including:

- Sign Up
- Personal Information
- Phone Verification
- Registration Success
- Additional Phone Verification

Although these screens represent important parts of account onboarding, their organization does not clearly communicate the overall registration process.

For example, the design includes a registration success screen followed by another phone verification screen. This makes the relationship between successful registration and phone verification unclear.

Additionally, the verification screen contains several tasks, including identity document upload, face verification, and PIN creation, without a clearly communicated progression.

### 2.2 Specific problems to address

1. **Unclear registration progression:** Users are not clearly informed about how many steps remain before registration is complete.

2. **Confusing verification sequence:** The relationship between registration success and the additional phone verification screen is unclear.

3. **Insufficient instructions:** Identity verification and PIN creation need clearer explanations.

4. **Form usability:** Input fields need consistent labels, readable instructions, and sufficient spacing.

5. **Limited visual feedback:** Important actions should communicate their current state and provide understandable feedback.

These problems are identified from the previous student's supplied design. They should not be interpreted as confirmed defects in the real H-CASH application's registration workflow, which was not personally tested.

## 3. Proposed Solution

The proposed solution is to reorganize the registration and verification experience into three clearly structured screens.

The redesign will preserve the H-CASH navy-blue and gold visual identity while improving usability, readability, accessibility, and visual consistency.

### 3.1 Screen One: Create Account

**Purpose:** Collect the basic information required to begin account registration.

**Proposed interface elements:**

- H-CASH branding and logo.
- Create Account heading.
- Short explanation of the registration process.
- Full Name input field.
- Phone Number input field.
- Regional Location input field.
- Continue button.
- Existing Account? Login navigation link.
- Registration progress indicator.

**Proposed improvements:**

- Use persistent labels instead of relying only on placeholder text.
- Organize the fields vertically with consistent spacing.
- Make the phone number input easy to identify.
- Provide clear input guidance.
- Use a prominent Continue button.
- Show the user's current registration step.

**Expected benefit:**

Users can understand what information is required and begin registration without unnecessary confusion.

### 3.2 Screen Two: Identity and Security

**Purpose:** Present identity verification and PIN setup in a clearly organized interface.

**Proposed interface elements:**

- Screen heading and explanatory text.
- Identity document upload section.
- Face verification section.
- Create PIN input.
- Confirm PIN input.
- Continue button.
- Back navigation.
- Progress indicator.

**Proposed improvements:**

- Separate identity verification tasks into visually distinct sections.
- Provide short instructions for each task.
- Make upload actions clearly identifiable.
- Use appropriate icons to communicate each verification task.
- Make PIN fields understandable and easy to interact with.
- Keep the interface organized on smaller mobile screens.

**Expected benefit:**

Users can understand the different identity and security tasks without having to interpret a crowded or confusing interface.

**Design assumption:** These elements are based on the previous student's proposed registration design. The redesign does not claim that every element is a verified requirement of the real H-CASH application.

### 3.3 Screen Three: Phone Verification

**Purpose:** Allow users to verify the phone number provided during registration.

**Proposed interface elements:**

- H-CASH branding.
- Phone Verification heading.
- Explanation that a verification code has been sent.
- Masked phone number.
- Six-digit OTP input interface.
- Resend Code option.
- Verify button.
- Change Phone Number option.
- Back navigation.
- Registration completion success state.

**Proposed improvements:**

- Clearly explain the purpose of the verification code.
- Use a readable six-digit code input interface.
- Make the resend option easy to find.
- Display the phone number being verified.
- Provide clear visual feedback for invalid or successful verification.
- Show registration success after successful verification instead of introducing another separate verification screen.

**Expected benefit:**

Users can understand the final verification step and receive clear feedback about whether registration has been completed.

## 4. Design Decisions

### 4.1 Color palette

The redesign will preserve the recognizable H-CASH branding.

| Design element | Proposed color |
|---|---|
| Primary | Navy blue |
| Secondary | Gold / yellow |
| Main background | White or light neutral |
| Primary text | Dark navy |
| Secondary text | Neutral gray |
| Primary button | Gold with dark text |
| Error feedback | Accessible red |
| Success feedback | Accessible green |

The exact color values will be established from the original design references and documented in the Android color resources.

### 4.2 Typography

The redesigned screens will use a consistent typography hierarchy:

- Large and prominent screen titles.
- Clearly readable section headings.
- Comfortable input labels.
- Readable supporting instructions.
- Consistent button text.

Text will use scalable Android `sp` units.

### 4.3 Layout and spacing

The design will follow a mobile-first approach.

- Use consistent spacing between form fields.
- Group related information.
- Avoid unnecessary decorative elements.
- Provide sufficient space around interactive controls.
- Support vertical scrolling on smaller screens.
- Avoid content clipping and overlapping.

### 4.4 Accessibility

The redesign will consider the following accessibility requirements:

- Interactive touch targets of at least 48dp.
- Appropriate text contrast.
- Readable font sizes.
- Clear field labels.
- Descriptive text for important icons.
- Understandable error and success feedback.
- Support for different mobile screen sizes.

### 4.5 Navigation

The registration flow will use simple forward and backward navigation.

The proposed sequence is:

1. Create Account.
2. Identity and Security.
3. Phone Verification.
4. Registration Success state.

The success state will appear after successful verification on the third screen. It will not be implemented as an unnecessary fourth registration screen.

## 5. Expected Impact

The proposed redesign is expected to provide the following improvements.

### 5.1 Improved usability

The three-screen sequence provides a clearer structure for completing registration and verification.

### 5.2 Improved readability

Consistent typography, spacing, and input labels will make information easier to understand.

### 5.3 Reduced confusion

A clear progression indicator and better organization of verification tasks will help users understand where they are in the registration process.

### 5.4 Improved accessibility

Larger touch targets, readable text, and better contrast will make the interface more accessible across mobile devices.

### 5.5 Improved visual consistency

Using consistent colors, buttons, form fields, headings, and navigation elements will create a more coherent experience.

These are expected design benefits. They have not yet been measured through user testing.

## 6. Scope of the Redesign

The project will focus exclusively on the account registration and verification flow.

| Component | Included |
|---|---|
| Create Account screen | Yes |
| Identity and Security screen | Yes |
| Phone Verification screen | Yes |
| Registration success state | Yes, within Screen 3 |
| Login redesign | No |
| Home Dashboard redesign | No |
| Merchant Payment redesign | No |
| Deposit redesign | No |
| Bank Selection redesign | No |
| Airtime redesign | No |
| Withdrawal redesign | No |
| Transaction History redesign | No |
| Backend authentication | No |
| Real SMS integration | No |
| Database integration | No |
| Real identity verification | No |

The excluded screens are outside the selected core flow and will remain unchanged.

## 7. Implementation Plan

The redesign will be implemented using Android Studio with Kotlin and XML Views.

### 7.1 Android resources

The implementation will use appropriate Android resource directories:

- `res/layout/` for screen layouts.
- `res/drawable/` for backgrounds, shapes, and icons.
- `res/values/colors.xml` for the color palette.
- `res/values/strings.xml` for text resources.
- `res/values/dimens.xml` for reusable dimensions.
- `res/values/themes.xml` for application themes.

### 7.2 Screen layouts

The implementation will include:

- Create Account layout.
- Identity and Security layout.
- Phone Verification layout.

Reusable styles and components will be used where appropriate.

### 7.3 Visual navigation

Simple navigation between the three screens may be implemented using Kotlin.

No real authentication, SMS delivery, database operations, or backend services will be developed because the assignment focuses on UI/UX design.

### 7.4 Testing and preview

The implementation will be evaluated using Android Studio's Design Preview and, where appropriate, an Android emulator.

The layouts will be checked on at least two different screen sizes.

Preview screenshots will be saved in the repository's `screenshots/` directory.

## 8. Limitations

This proposal has several limitations:

1. The real H-CASH application was not personally installed or tested.
2. The redesign is based on visual evidence and the previous student's supplied design.
3. The proposed identity verification requirements are inherited from the previous student's design and are not independently verified.
4. No real authentication, SMS, or identity verification functionality will be implemented.
5. The expected usability improvements have not been validated through user testing.

Future work could include usability testing with potential users, evaluating the actual registration process, and refining the interface based on user feedback.

## 9. Conclusion

This proposal addresses the organization and usability of the H-CASH registration and verification experience.

Instead of redesigning the entire application, the project focuses on three screens that form one core user flow.

The proposed improvements emphasize clear progression, understandable instructions, readable forms, accessible controls, and consistent visual design.

The final implementation will use Android Studio XML layouts while preserving the original H-CASH visual identity.

The result will be a focused redesign that addresses specific issues identified in the critique and demonstrates the practical application of mobile UI/UX design principles.