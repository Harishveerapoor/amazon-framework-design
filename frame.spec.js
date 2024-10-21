import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  // Go to Amazon India
  await page.goto('https://www.amazon.in/');
  
  // Click on "Sign in"
  await page.getByRole('link', { name: 'Sign in', exact: true }).click();
  
  // Fill in email/phone number and password
  await page.getByLabel('Email or mobile phone number').fill('9353804347');
  await page.getByRole('button', { name: 'Continue' }).click();
  await page.getByLabel('Password').fill('Harish@6');
  await page.getByRole('button', { name: 'Sign in' }).click();
  
  // Search for "Samsung Galaxy S23 Ultra 5G"
  await page.getByPlaceholder('Search Amazon.in').click();
  await page.getByPlaceholder('Search Amazon.in').fill('Samsung Galaxy S23 Ultra 5G');
  await page.getByRole('button', { name: 'Go', exact: true }).click();
  
  // Click on the first result (Samsung Galaxy S23 Ultra 5G)
  await page.locator('#a-autoid-1-announce').click();
  
  // Go to Cart
  await page.getByRole('link', { name: 'Go to Cart' }).click();
  
  // Update quantity
  await page.locator('#a-autoid-0-announce').click();
  await page.getByLabel('6', { exact: true }).getByText('6').click();
  // proceed to by the product
  await page.getByLabel('Proceed to Buy Buy Amazon').click();
  // chosing the adrees
  await page.getByTestId('Address_selectShipToThisAddress').click();
  await page.goto('https://www.amazon.in/gp/buy/payselect/handlers/display.html?hasWorkingJavascript=1');
  
});




//    npx playwright test tests/frame.spec.js
//   npx playwright test frame.spec.js --headed
//   npx playwright codegen




